// Generated code from Butter Knife. Do not modify!
package wanganxin.com.poker.GameActivity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import wanganxin.com.poker.R;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  private View view2131230835;

  private View view2131230761;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(final RegisterActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.fab, "field 'fab' and method 'onClick'");
    target.fab = Utils.castView(view, R.id.fab, "field 'fab'", FloatingActionButton.class);
    view2131230835 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.cvAdd = Utils.findRequiredViewAsType(source, R.id.cv_add, "field 'cvAdd'", CardView.class);
    target.etUsername = Utils.findRequiredViewAsType(source, R.id.et_register_username, "field 'etUsername'", EditText.class);
    target.etPassword = Utils.findRequiredViewAsType(source, R.id.et_register_password, "field 'etPassword'", EditText.class);
    target.etRepeatpassword = Utils.findRequiredViewAsType(source, R.id.et_repeatpassword, "field 'etRepeatpassword'", EditText.class);
    view = Utils.findRequiredView(source, R.id.bt_go, "field 'btRegister' and method 'onClick'");
    target.btRegister = Utils.castView(view, R.id.bt_go, "field 'btRegister'", Button.class);
    view2131230761 = view;
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
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.fab = null;
    target.cvAdd = null;
    target.etUsername = null;
    target.etPassword = null;
    target.etRepeatpassword = null;
    target.btRegister = null;

    view2131230835.setOnClickListener(null);
    view2131230835 = null;
    view2131230761.setOnClickListener(null);
    view2131230761 = null;
  }
}
