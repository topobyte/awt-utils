// Copyright 2016 Sebastian Kuerten
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

import java.awt.image.BufferedImage;

/**
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public class ImageUtil
{

	/**
	 * Create a copy of this BufferedImage.
	 * 
	 * @param image
	 *            the image to create a copy of.
	 * @return a duplicate.
	 */
	public static BufferedImage duplicate(BufferedImage image)
	{
		BufferedImage copy = new BufferedImage(image.getWidth(),
				image.getHeight(), image.getType());
		copy.getGraphics().drawImage(image, 0, 0, null);
		return copy;
	}

}
