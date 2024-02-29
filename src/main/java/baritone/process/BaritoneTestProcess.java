/*
 * This file is part of Baritone.
 *
 * Baritone is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Baritone is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Baritone.  If not, see <https://www.gnu.org/licenses/>.
 */

package baritone.process;

import baritone.Baritone;
import baritone.api.process.IBaritoneProcess;
import baritone.api.process.PathingCommand;
import baritone.utils.BaritoneProcessHelper;

public class BaritoneTestProcess extends BaritoneProcessHelper implements IBaritoneProcess {


    public BaritoneTestProcess(Baritone baritone) {
        super(baritone);
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public PathingCommand onTick(boolean calcFailed, boolean isSafeToCancel) {
        return null;
    }

    @Override
    public void onLostControl() {

    }

    @Override
    public String displayName0() {
        return null;
    }
}
