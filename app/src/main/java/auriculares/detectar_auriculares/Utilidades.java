package auriculares.detectar_auriculares;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by francis on 26/12/14.
 */
public final class Utilidades
{
    public static void mostrarToastText(Context actividad, String texto)
    {
        Toast toast = Toast.makeText(actividad, texto, Toast.LENGTH_LONG);
        toast.show();
    }
}
