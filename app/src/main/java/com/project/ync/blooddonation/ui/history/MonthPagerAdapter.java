package jp.welby.pah.ui.calendar;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import java.util.Calendar;

import jp.welby.pah.util.TimeUtil;

/**
 * @author Ync.
 */
public class MonthPagerAdapter extends FragmentStatePagerAdapter {
    private static final int MAX_MONTH_LIMIT = 12;
    private static final int MAX_YEAR_LIMIT = 3000;
    private int mType;
    private Calendar mCalendar;

    public MonthPagerAdapter(FragmentManager fm, Calendar calendar, int type) {
        super(fm);
        mType = type;
        mCalendar = calendar != null ? calendar : Calendar.getInstance();
    }

    @Override
    public Fragment getItem(int position) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, position - TimeUtil.getNumberMonthBetWeenTwoDays(mCalendar, Calendar.getInstance()));
        return MonthFragment_.builder()
                .mCalendar(calendar).mStartNote(mCalendar).mType(mType).build();
    }

    @Override
    public int getCount() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, MAX_MONTH_LIMIT);
        calendar.set(Calendar.YEAR, MAX_YEAR_LIMIT);
        return TimeUtil.getNumberMonthBetWeenTwoDays(mCalendar, calendar);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, position - TimeUtil.getNumberMonthBetWeenTwoDays(mCalendar, Calendar.getInstance()));
        return TimeUtil.getFormattedYearMonth(calendar);
    }
}
