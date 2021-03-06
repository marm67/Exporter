package org.vaadin.haijian;

import org.vaadin.haijian.filegenerator.ExcelFileBuilder;
import org.vaadin.haijian.filegenerator.FileBuilder;

import com.vaadin.data.Container;
import com.vaadin.ui.Table;

public class ExcelExporter extends Exporter {

    public ExcelExporter(Table table) {
        super(table);
    }

    public ExcelExporter(Container container) {
        super(container);
    }

    public ExcelExporter(Container container, Object[] visibleColumns) {
        super(container, visibleColumns);
    }

    @Override
    protected FileBuilder createFileBuilder(Container container) {
        return new ExcelFileBuilder(container);
    }

    @Override
    protected String getDownloadFileName() {
        return "exported-excel.xls";
    }
}
