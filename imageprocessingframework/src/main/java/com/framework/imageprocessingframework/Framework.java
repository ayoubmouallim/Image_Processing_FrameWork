package com.framework.imageprocessingframework;

import com.framework.imageprocessingframework.compress.Compress;
import com.framework.imageprocessingframework.compress.CompressChild1;
import com.framework.imageprocessingframework.filter.Filter;
import com.framework.imageprocessingframework.filter.FilterDefaultImpl;
import com.framework.imageprocessingframework.filter.FilterImpl1;

public class Framework {

    private Filter filter;
    private Compress compress;
    private static Framework framework;

    private Framework() {
        filter =  new FilterDefaultImpl();
        compress = new CompressChild1();
    }

    public static Framework getInstance()
    {
        if(framework== null)  framework = new Framework();
        return framework;
    }


    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public Compress getCompress() {
        return compress;
    }

    public void setCompress(Compress compress) {
        this.compress = compress;
    }
}
