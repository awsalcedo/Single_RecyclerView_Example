package asalcedo.com.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import asalcedo.com.affirmations.R
import asalcedo.com.affirmations.databinding.ListItemBinding
import asalcedo.com.affirmations.model.Affirmation

/****
 * Project: Affirmations
 * From: asalcedo.com.affirmations.adapter
 * Created by Alex Salcedo Silva on 14/3/22 at 21:55
 * All rights reserve 2022.
 ***/
class ItemAdapter(private val context: Context, private val dataset: List<Affirmation>) :
    RecyclerView.Adapter<ItemAdapter.AffirmationViewHolder>() {
    class AffirmationViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val binding = ListItemBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return AffirmationViewHolder(view)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        val item = dataset[position]
        with(holder){
            binding.itemTitle.text = context.resources.getString(item.stringResourceId)
        }
    }

    override fun getItemCount() = dataset.size

}