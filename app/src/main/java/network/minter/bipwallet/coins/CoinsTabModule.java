/*******************************************************************************
 * Copyright (C) by MinterTeam. 2018
 * @link https://github.com/MinterTeam
 * @link https://github.com/edwardstock
 *
 * The MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 ******************************************************************************/

package network.minter.bipwallet.coins;

import android.arch.lifecycle.MutableLiveData;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.arellomobile.mvp.MvpView;

import dagger.Module;
import network.minter.bipwallet.internal.mvp.ProgressView;
import network.minter.bipwallet.tx.adapters.TransactionDataSource;

/**
 * MinterWallet. 2018
 *
 * @author Eduard Maximovich <edward.vstock@gmail.com>
 */
@Module
public interface CoinsTabModule {

    interface CoinsTabView extends MvpView {
        void setAvatar(String url);
        void setUsername(CharSequence name);
        void setBalance(long intPart, long fractionalPart, CharSequence coinName);
        void setAdapter(RecyclerView.Adapter<?> adapter);
        void setOnAvatarClick(View.OnClickListener listener);
        void startTransactionList();
        void hideAvatar();
        void startConvertCoins();
        void startTab(int tab);
    }

    interface TransactionListView extends MvpView, ProgressView {
        void setAdapter(RecyclerView.Adapter<?> adapter);
        void setOnRefreshListener(SwipeRefreshLayout.OnRefreshListener listener);
        void showRefreshProgress();
        void hideRefreshProgress();
        void scrollTo(int pos);
        void startExplorer(String hash);
        void syncProgress(MutableLiveData<TransactionDataSource.LoadState> loadState);
    }
}