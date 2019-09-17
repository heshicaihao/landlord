// Generated code from Butter Knife. Do not modify!
package wanganxin.com.poker.GameActivity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import wanganxin.com.poker.R;

public class PlayerInfoActivity_ViewBinding implements Unbinder {
  private PlayerInfoActivity target;

  private View view2131230909;

  private View view2131230762;

  @UiThread
  public PlayerInfoActivity_ViewBinding(PlayerInfoActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PlayerInfoActivity_ViewBinding(final PlayerInfoActivity target, View source) {
    this.target = target;

    View view;
    target.playerName = Utils.findRequiredViewAsType(source, R.id.player_name, "field 'playerName'", EditText.class);
    view = Utils.findRequiredView(source, R.id.player_pic, "field 'playerPic' and method 'playerPicChange'");
    target.playerPic = Utils.castView(view, R.id.player_pic, "field 'playerPic'", TextView.class);
    view2131230909 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.playerPicChange();
      }
    });
    target.playerSex = Utils.findRequiredViewAsType(source, R.id.player_sex_rg, "field 'playerSex'", RadioGroup.class);
    target.playerScore = Utils.findRequiredViewAsType(source, R.id.player_score, "field 'playerScore'", TextView.class);
    view = Utils.findRequiredView(source, R.id.bt_save, "method 'saveChange'");
    view2131230762 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.saveChange();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    PlayerInfoActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.playerName = null;
    target.playerPic = null;
    target.playerSex = null;
    target.playerScore = null;

    view2131230909.setOnClickListener(null);
    view2131230909 = null;
    view2131230762.setOnClickListener(null);
    view2131230762 = null;
  }
}
