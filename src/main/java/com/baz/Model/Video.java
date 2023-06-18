package com.baz.Model;

import com.baz.Interfaces.MoviesInterface;

public abstract class Video {
    protected MoviesInterface movie;

    public Video(MoviesInterface movie){
        this.movie=movie;
    }

    public abstract void describir();
}
