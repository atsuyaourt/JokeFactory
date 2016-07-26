package com.example.jokes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeSource {

    private Random mRandomGenerator;
    List<String> mJokes;

    public JokeSource() {
        mJokes = new ArrayList<>();
        mRandomGenerator = new Random();
        initJoke();
    }

    public String tellAJoke(){
        int rIndex = mRandomGenerator.nextInt(mJokes.size());
        return mJokes.get(rIndex);
    }

    private void initJoke() {
        String[] jokes = new String[]{
                "Can a kangaroo jump higher than a house? Of course, a house doesn't jump at all",
                "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away",
                "What is the difference between a snowman and a snowwoman? - Snowballs",
                "I'd like to buy a new boomerang please. Also, can you tell me how to throw the old one away?",
                "I can't believe I forgot to go to the gym today. That's 7 years in a row now.",
                "A naked women robbed a bank. Nobody could remember her face.",
                "The 21st century: Deleting history is often more important than making it.",
                "How do you tell that a crab is drunk? It walks forwards.",
                "Why do cows wear bells? Their horns don't work.",
                "I'm selling my talking parrot. Why? Because yesterday, the bastard tried to sell me.",
                "What would you call a very funny mountain? - Hill Arious",
                "Why haven't you ever seen any elephants hiding up trees? Because they're really, really good at it.",
                "A wife is like a hand grenade. Take off the ring and say good bye to your house.",
                "What happens when you cross a snowman and a vampire? You get a frostbite."
        };
        mJokes.addAll(Arrays.asList(jokes));

    }
}

