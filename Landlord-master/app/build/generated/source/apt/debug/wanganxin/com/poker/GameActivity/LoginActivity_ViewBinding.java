// Generated code from Butter Knife. Do not modify!
package wanganxin.com.poker.GameActivity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import wanganxin.com.poker.R;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131230761;

  private View view2131230835;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.etUsername = Utils.findRequiredViewAsType(source, R.id.et_username, "field 'etUsername'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_password, "field 'etPassword'", EditText.class);
    target.ck_remberPass = Utils.findRequiredViewAsType(source, R.id.ck_remberPass, "field 'ck_remberPass'", CheckBox.class);
    target.ck_autoLogin = Utils.findRequiredViewAsType(source, R.id.ck_autoLogin, "field 'ck_autoLogin'", CheckBox.class);
    view = Utils.findRequiredView(source, R.id.bt_go, "field 'btGo' and method 'onClick'");
    target.btGo = Utils.castView(view, R.id.bt_go, "field 'btGo'", Button.class);
    view2131230761 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.cv = Utils.findRequiredViewAsType(source, R.id.cv, "field 'cv'", CardView.class);
    view = Utils.findRequiredView(source, R.id.fab, "field 'fab' and method 'onClick'");
    target.fab = Utils.castView(view, R.id.fab, "field 'fab'", FloatingActionButton.class);
    view2131230835 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.etUsername = null;
    target.etPassword = null;
    target.ck_remberPass = null;
    target.ck_autoLogin = null;
    target.btGo = null;
    target.cv = null;
    target.fab = null;

    view2131230761.setOnClickListener(null);
    view2131230761 = null;
    view2131230835.setOnClickListener(null);
    view2131230835 = null;
  }
}
