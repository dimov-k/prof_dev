package ru.mrroot.translator.historyscreen.view.history

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import org.koin.android.ext.android.inject
import org.koin.android.scope.AndroidScopeComponent
import org.koin.androidx.scope.activityRetainedScope
import org.koin.core.scope.Scope
import ru.mrroot.translator.core.BaseActivity
import ru.mrroot.translator.descriptionscreen.DescriptionActivity
import ru.mrroot.translator.historyscreen.R
import ru.mrroot.translator.historyscreen.convertMeaningsToString
import ru.mrroot.translator.historyscreen.databinding.ActivityHistoryBinding
import ru.mrroot.translator.model.data.AppState
import ru.mrroot.translator.model.data.Word
import ru.mrroot.translator.utils.viewById

class HistoryActivity : BaseActivity<AppState, HistoryInteractor>(), AndroidScopeComponent {

    private lateinit var binding: ActivityHistoryBinding
    override val scope: Scope by activityRetainedScope()
    override lateinit var model: HistoryViewModel
    private val adapter: HistoryAdapter by lazy { HistoryAdapter(onListItemClickListener) }
    private val historyActivityRecyclerview by viewById<RecyclerView>(R.id.history_activity_recyclerview)
    private val onListItemClickListener: HistoryAdapter.OnListItemClickListener =
        object : HistoryAdapter.OnListItemClickListener {
            override fun onItemClick(data: Word) = showDescription(data)
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHistoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iniViewModel()
        initViews()
    }

    override fun onResume() {
        super.onResume()
        model.getAllData()
    }

    override fun setDataToAdapter(data: List<Word>) {
        adapter.setData(data)
    }

    private fun iniViewModel() {
        if (historyActivityRecyclerview.adapter != null) {
            throw IllegalStateException("The ViewModel should be initialised first")
        }
        val viewModel: HistoryViewModel by inject()
        model = viewModel
        model.subscribe().observe(this@HistoryActivity, Observer<AppState> { renderData(it) })
    }

    private fun showDescription(data: Word) {
        startActivity(
            DescriptionActivity.getIntent(
                this@HistoryActivity,
                data.text,
                convertMeaningsToString(data.meanings),
                data.meanings[0].imageUrl
            )
        )
    }

    private fun initViews() {
        historyActivityRecyclerview.adapter = adapter
    }
}