package asalcedo.com.affirmations.data

import asalcedo.com.affirmations.R
import asalcedo.com.affirmations.model.Affirmation

/****
 * Project: Affirmations
 * From: asalcedo.com.affirmations.data
 * Created by Alex Salcedo Silva on 13/3/22 at 13:41
 * All rights reserve 2022.
 ***/
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)

        )
    }
}