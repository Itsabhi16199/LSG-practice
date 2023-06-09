package com.mindorks.framework.lsgpractice

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.mindorks.framework.lsgpractice.ui.framework.main.standingmodel.Team
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.*
import javax.inject.Inject

@HiltViewModel
class StandingViewModel @Inject constructor(val repository: StandingRepository) : ViewModel() {

    public val _standingLiveData = MutableLiveData<List<Team>>()

    var job: Job? = null
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }

    val loading = MutableLiveData<Boolean>()

    fun loadstanding() {

        job = CoroutineScope(Dispatchers.IO).launch {
            val response = repository.getlist()
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {
                    val body = response.body()
//                    val list = ArrayList( response.body()?.content?.NewsItems)
//                       itemlist.postValue(list)

                    body?.let {
                        val content = it.standings.stage1.groups[0]
                        content.let {
                            val nlist = ArrayList(it.team)

                            _standingLiveData.postValue(nlist)

                            Log.d(TAG,"cricket" + nlist)
                        }
                    }
                    loading.value = false
                } else {
                    onError("Error : ${response.message()} ")
                }
            }
        }

    }

    private fun onError(message: String) {
//        errorMessage.value = message
//        loading.value = false
    }




}