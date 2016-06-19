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

import java.awt.GridBagConstraints;

/**
 * A convenience wrapper for a {@link GridBagConstraints} instance. The wrapper
 * allows settings properties of the encapsulated instance using method
 * chaining.
 * 
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public class GridBagConstraintsEditor
{

	private GridBagConstraints c;

	public GridBagConstraintsEditor()
	{
		c = new GridBagConstraints();
	}

	public GridBagConstraintsEditor(GridBagConstraints c)
	{
		this.c = c;
	}

	public GridBagConstraints getConstraints()
	{
		return c;
	}

	public GridBagConstraintsEditor gridX(int gridX)
	{
		c.gridx = gridX;
		return this;
	}

	public GridBagConstraintsEditor gridY(int gridY)
	{
		c.gridy = gridY;
		return this;
	}

	public GridBagConstraintsEditor gridPos(int gridX, int gridY)
	{
		c.gridx = gridX;
		c.gridy = gridY;
		return this;
	}

	public GridBagConstraintsEditor gridWidth(int gridWidth)
	{
		c.gridwidth = gridWidth;
		return this;
	}

	public GridBagConstraintsEditor gridHeight(int gridHeight)
	{
		c.gridheight = gridHeight;
		return this;
	}

	public GridBagConstraintsEditor gridSize(int gridWidth, int gridHeight)
	{
		c.gridwidth = gridWidth;
		c.gridheight = gridHeight;
		return this;
	}

	public GridBagConstraintsEditor weightX(double weightX)
	{
		c.weightx = weightX;
		return this;
	}

	public GridBagConstraintsEditor weightY(double weightY)
	{
		c.weighty = weightY;
		return this;
	}

	public GridBagConstraintsEditor weight(double weightX, double weightY)
	{
		c.weightx = weightX;
		c.weighty = weightY;
		return this;
	}

	public GridBagConstraintsEditor anchor(int anchor)
	{
		c.anchor = anchor;
		return this;
	}

	public GridBagConstraintsEditor fill(int fill)
	{
		c.fill = fill;
		return this;
	}

	public GridBagConstraintsEditor ipadX(int ipadX)
	{
		c.ipadx = ipadX;
		return this;
	}

	public GridBagConstraintsEditor ipadY(int ipadY)
	{
		c.ipady = ipadY;
		return this;
	}

	public GridBagConstraintsEditor ipad(int ipadX, int ipadY)
	{
		c.ipadx = ipadX;
		c.ipady = ipadY;
		return this;
	}

}
