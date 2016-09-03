// Copyright 2013 Sebastian Kuerten
//
// This file is part of awt-utils.
//
// awt-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// awt-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with awt-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.awt.util;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public class GraphicsUtil
{

	public static void useAntialiasing(Graphics2D g, boolean value)
	{
		if (value) {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
		} else {
			g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_OFF);
		}
	}

}
