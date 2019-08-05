package com.example.android.guesstheword.screens.game

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    // The current word
    private var _word = MutableLiveData<String>()

    val word: LiveData<String>
                    get() = _word

    // The current score
    private var _score = MutableLiveData<Int>()

    val score : LiveData<Int>
                    get() = _score

    private var _gameOver = MutableLiveData<Boolean>()

    val gameOver: LiveData<Boolean>
                    get() = _gameOver

    // The list of words - the front of the list is the next word to guess
    private lateinit var wordList: MutableList<String>


    init {
        resetList()
        nextWord()
        _score.value = 0
        _gameOver.value = false
    }


    /**
     * Resets the list of words and randomizes the order
     */
    private fun resetList() {
        wordList = mutableListOf(
                "queen",
                "hospital",
                "basketball",
                "cat",
                "change",
                "snail",
                "soup",
                "calendar",
                "sad",
                "desk",
                "guitar",
                "home",
                "railway",
                "zebra",
                "jelly",
                "car",
                "crow",
                "trade",
                "bag",
                "roll",
                "bubble"
        )
        wordList.shuffle()
    }


    /**
     * Moves to the next word in the list
     */
    private fun nextWord() {
        //Select and remove a word from the list
        if (wordList.isEmpty()) {
            _gameOver.value = true
        } else {
            _word.value = wordList.removeAt(0)
        }
    }


    fun onSkip() {
        _score.value = score.value?.minus(1)
        nextWord()
    }

    fun onCorrect() {
        _score.value = score.value?.plus(1)
        nextWord()
    }

    fun onGameFinshed() {
        _gameOver.value = false
    }

    override fun onCleared() {
        super.onCleared()
    }
}