package com.alita.designpattern.strategyInstance;

import java.time.chrono.IsoChronology;

/**
 * Title:
 * Description:
 * Company:
 *
 * @author im.alitaalice@gmail.com
 * @date Created in 22:03 2020/8/19
 */
public class GiveGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯，放行!");
    }
}
