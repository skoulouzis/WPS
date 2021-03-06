/**
 * ﻿Copyright (C) 2010 - 2016 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 as published
 * by the Free Software Foundation.
 *
 * If the program is linked with libraries which are licensed under one of
 * the following licenses, the combination of the program with the linked
 * library is not considered a "derivative work" of the program:
 *
 *       • Apache License, version 2.0
 *       • Apache Software License, version 1.0
 *       • GNU Lesser General Public License, version 3
 *       • Mozilla Public License, versions 1.0, 1.1 and 2.0
 *       • Common Development and Distribution License (CDDL), version 1.0
 *
 * Therefore the distribution of the program linked with libraries licensed
 * under the aforementioned licenses, is permitted by the copyright holders
 * if the distribution is compliant with both the GNU General Public
 * License version 2 and the aforementioned licenses.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 */
package org.n52.wps.server.r.data;

import org.n52.wps.io.data.IData;
import org.n52.wps.io.data.binding.complex.GenericFileDataBinding;

public class CustomDataType implements RTypeDefinition {

    String key;

    String processKey;

    String encoding;

    String schema;

    boolean isComplex;

    public void setComplex(boolean isComplex) {
        this.isComplex = isComplex;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getProcessKey() {
        return this.processKey;
    }

    @Override
    public boolean isComplex() {
        return this.isComplex;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setProcessKey(String processKey) {
        this.processKey = processKey;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    @Override
    public String getEncoding() {
        return "base64";
    }

    @Override
    public String getSchema() {
        return this.schema;
    }

    @Override
    public Class< ? extends IData> getIDataClass() {
        return GenericFileDataBinding.class;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CustomDataType [");
        if (key != null) {
            builder.append("key=");
            builder.append(key);
            builder.append(", ");
        }
        if (processKey != null) {
            builder.append("processKey=");
            builder.append(processKey);
            builder.append(", ");
        }
        if (encoding != null) {
            builder.append("encoding=");
            builder.append(encoding);
            builder.append(", ");
        }
        if (schema != null) {
            builder.append("schema=");
            builder.append(schema);
            builder.append(", ");
        }
        builder.append("isComplex=");
        builder.append(isComplex);
        builder.append("]");
        return builder.toString();
    }

}
