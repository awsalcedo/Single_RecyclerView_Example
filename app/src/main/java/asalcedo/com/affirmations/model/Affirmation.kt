package asalcedo.com.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/****
 * Project: Affirmations
 * From: asalcedo.com.affirmations.model
 * Created by Alex Salcedo Silva on 13/3/22 at 13:38
 * All rights reserve 2022.
 ***/
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
