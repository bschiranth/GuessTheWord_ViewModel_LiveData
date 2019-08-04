package com.example.android.guesstheword.screens.game;

import java.lang.System;

/**
 * * Fragment where the game is played
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J&\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0002J\b\u0010\u0018\u001a\u00020\fH\u0002J\b\u0010\u0019\u001a\u00020\fH\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/android/guesstheword/screens/game/GameFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/example/android/guesstheword/databinding/GameFragmentBinding;", "score", "", "word", "", "wordList", "", "gameFinished", "", "nextWord", "onCorrect", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onSkip", "resetList", "updateScoreText", "updateWordText", "app_debug"})
public final class GameFragment extends androidx.fragment.app.Fragment {
    private java.lang.String word;
    private int score;
    private java.util.List<java.lang.String> wordList;
    private com.example.android.guesstheword.databinding.GameFragmentBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    /**
     * * Resets the list of words and randomizes the order
     */
    private final void resetList() {
    }
    
    /**
     * * Called when the game is finished
     */
    private final void gameFinished() {
    }
    
    /**
     * * Moves to the next word in the list
     */
    private final void nextWord() {
    }
    
    /**
     * Methods for buttons presses 
     */
    private final void onSkip() {
    }
    
    private final void onCorrect() {
    }
    
    /**
     * Methods for updating the UI 
     */
    private final void updateWordText() {
    }
    
    private final void updateScoreText() {
    }
    
    public GameFragment() {
        super();
    }
}