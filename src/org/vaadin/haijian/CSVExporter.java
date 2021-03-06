package org.vaadin.haijian;

import org.vaadin.haijian.filegenerator.CSVFileBuilder;
import org.vaadin.haijian.filegenerator.FileBuilder;

import com.vaadin.data.Container;
import com.vaadin.ui.Table;

public class CSVExporter extends Exporter {

    public CSVExporter(Table table) {
        super(table);
    }

    public CSVExporter(Container container) {
        super(container);
    }

    @Override
    protected FileBuilder createFileBuilder(Container container) {
        // TODO Auto-generated method stub
        return new CSVFileBuilder(container);
    }

    @Override
    protected String getDownloadFileName() {
        return "exported-csv";
    }

}
