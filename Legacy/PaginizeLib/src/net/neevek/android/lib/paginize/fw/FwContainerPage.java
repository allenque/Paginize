package net.neevek.android.lib.paginize.fw;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * Copyright (c) 2015 neevek <i@neevek.net>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:

 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

/**
 * An FwInnerPageContainer is a FwPage that is used to hold & manage FwInnerPages
 *
 * @see FwContainerPageManager
 * @see FwContainerInnerPage
 */
public abstract class FwContainerPage extends FwPage implements FwInnerPageContainer {
  private FwContainerPageManager mContainerPageManager;

  public FwContainerPage(FwPageManager pageManager) {
    super(pageManager);
    mContainerPageManager = new FwContainerPageManager(this);
  }

  public void setInnerPage(FwInnerPage newPage, Object data) {
    mContainerPageManager.setPage(newPage, data);
  }

  public void unsetInnerPage() {
    mContainerPageManager.unsetPage();
  }

  public FwInnerPage getCurrentInnerPage() {
    return mContainerPageManager.getCurrentInnerPage();
  }

  @Override
  public ViewGroup getContainerView() {
    return mContainerPageManager.getContainerView();
  }

  @Override
  public boolean onBackPressed() {
    return mContainerPageManager.onBackPressed();
  }

  @Override
  public boolean onKeyDown(int keyCode, KeyEvent event) {
    if (mContainerPageManager.onKeyDown(keyCode, event)) {
      return true;
    }
    return super.onKeyDown(keyCode, event);
  }

  @Override
  public boolean onKeyUp(int keyCode, KeyEvent event) {
    if (mContainerPageManager.onKeyUp(keyCode, event)) {
      return true;
    }
    return super.onKeyUp(keyCode, event);
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    if (mContainerPageManager.onTouchEvent(event)) {
      return true;
    }
    return super.onTouchEvent(event);
  }

  @Override
  public void onShow(Object arg) {
    mContainerPageManager.onShow(arg);
  }

  @Override
  public void onShown(Object arg) {
    mContainerPageManager.onShown(arg);
  }

  @Override
  public void onHide() {
    mContainerPageManager.onHide();
  }

  @Override
  public void onHidden() {
    mContainerPageManager.onHidden();
  }

  @Override
  public void onCover() {
    mContainerPageManager.onCover();
  }

  @Override
  public void onCovered() {
    mContainerPageManager.onCovered();
  }

  @Override
  public void onUncover(Object arg) {
    mContainerPageManager.onUncover(arg);
  }

  @Override
  public void onUncovered(Object arg) {
    mContainerPageManager.onUncovered(arg);
  }
}
