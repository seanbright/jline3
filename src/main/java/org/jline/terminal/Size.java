/*
 * Copyright (c) 2002-2016, the original author or authors.
 *
 * This software is distributable under the BSD license. See the terms of the
 * BSD license in the documentation provided with this software.
 *
 * http://www.opensource.org/licenses/bsd-license.php
 */
package org.jline.terminal;

public class Size {

    private int rows;
    private int cols;

    public Size() {
    }

    public Size(int columns, int rows) {
        this();
        setColumns(columns);
        setRows(rows);
    }

    public int getColumns() {
        return cols;
    }

    public void setColumns(int columns) {
        cols = (short) columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = (short) rows;
    }

    public void copy(Size size) {
        setColumns(size.getColumns());
        setRows(size.getRows());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Size) {
            Size size = (Size) o;
            return rows == size.rows && cols == size.cols;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return rows * 31 + cols;
    }

    @Override
    public String toString() {
        return "Size[" + "cols=" + cols + ", rows=" + rows + ']';
    }
}
