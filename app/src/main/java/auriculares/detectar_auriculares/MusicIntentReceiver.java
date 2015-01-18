package auriculares.detectar_auriculares;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by francis on 26/12/14.
 */
public class MusicIntentReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG))
        {
            int state = intent.getIntExtra("state", -1);
            switch (state)
            {
                case 0:
                    Utilidades.mostrarToastText(context, "Headset is unplugged");
                    break;
                case 1:
                    Utilidades.mostrarToastText(context, "Headset is plugged");
                    break;
                default:
                    Utilidades.mostrarToastText(context, "I have no idea what the headset state is");
                    break;
            }
        }
    }
}
