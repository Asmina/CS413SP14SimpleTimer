package edu.luc.etl.cs313.android.simplestopwatch.model.state;

import edu.luc.etl.cs313.android.simplestopwatch.common.SimpleTimerUIUpdateSource;
import edu.luc.etl.cs313.android.simplestopwatch.common.SimpleTimerUIListener;
import edu.luc.etl.cs313.android.simplestopwatch.model.clock.OnTickListener;

/**
 * The state machine for the state-based dynamic model of the stopwatch.
 * This interface is part of the State pattern.
 *
 * @author laufer
 */
public interface SimpleTimerStateMachine extends SimpleTimerUIListener, OnTickListener, SimpleTimerUIUpdateSource, SimpleTimerSMStateView { }
