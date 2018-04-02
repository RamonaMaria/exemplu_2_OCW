package com.example.ionut_000.exemplucolocviu;


/**
 * Created by ionut_000 on 04/01/2018.
 */

public interface Constants {

    final public static String TAG = "TagulMeu";

    final public static String ACTION_STRING = "startedservice.string";
    final public static String ACTION_INTEGER = "startedservice.integer";
    final public static String ACTION_ARRAY_LIST = "startedservice.arraylist";

    final public static String DATA = "startedservice.data";

    final public static String MESSAGE = "startedserviceactivity.message";

    String[] actionTypes =
            {ACTION_INTEGER, ACTION_ARRAY_LIST, ACTION_STRING};

    final public static int NUMBER_OF_CLICKS_THRESHOLD = 10;
    Boolean SERVICE_STARTED = false;
    Boolean SERVICE_STOPPED = true;
}