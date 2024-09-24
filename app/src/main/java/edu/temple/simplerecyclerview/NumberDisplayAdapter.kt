package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val numbers: IntArray) :
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    // holder is a class that holds the view
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    // create a new view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = NumberViewHolder(
        TextView(parent.context).apply { setPadding(10, 10, 10, 10) }
    )

    // populate the view holder with data
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
        holder.textView.textSize = numbers[position].toFloat()
    }

    // the getView in the adapter without recycle view, you were doing the both of these things in the getView

//    override fun getItemCount(): Int {
//        return numbers.size
//    }
    override fun getItemCount() = numbers.size
    // you can reduce your function to this, this is a single expression function
    // the interpreter see the expression as just a value
    // 2 - 1    the compiler sees this as 1

    // TODO Step 3b: Complete function definitions for adapter

}