/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common Development
 * and Distribution License("CDDL") (collectively, the "License").  You
 * may not use this file except in compliance with the License.  You can
 * obtain a copy of the License at
 * https://glassfish.dev.java.net/public/CDDL+GPL_1_1.html
 * or packager/legal/LICENSE.txt.  See the License for the specific
 * language governing permissions and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file at packager/legal/LICENSE.txt.
 *
 * GPL Classpath Exception:
 * Oracle designates this particular file as subject to the "Classpath"
 * exception as provided by Oracle in the GPL Version 2 section of the License
 * file that accompanied this code.
 *
 * Modifications:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 *
 * Contributor(s):
 * If you wish your version of this file to be governed by only the CDDL or
 * only the GPL Version 2, indicate your decision by adding "[Contributor]
 * elects to include this software in this distribution under the [CDDL or GPL
 * Version 2] license."  If you don't indicate a single choice of license, a
 * recipient has the option to distribute your version of this file under
 * either the CDDL, the GPL Version 2 or to extend the choice of license to
 * its licensees as provided above.  However, if you add GPL Version 2 code
 * and therefore, elected the GPL Version 2 license, then the option applies
 * only if the new code is made subject to such option by the copyright
 * holder.
 *
 *
 * This file incorporates work covered by the following copyright and
 * permission notice:
 *
 * Copyright 2004 The Apache Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.servlet;

import java.util.Enumeration;

/**
 * A servlet configuration object used by a servlet container
 * to pass information to a servlet during initialization.
 *
 * <p>Servlet 配置对象：在初始化时，由 servlet 容器传递信息给 servlet。
 */
// 核心接口 Servlet配置对象（在初始化时，由servlet容器传递信息给servlet）
public interface ServletConfig {

    /**
     * Returns the name of this servlet instance.
     * The name may be provided via server administration, assigned in the 
     * web application deployment descriptor, or for an unregistered (and thus
     * unnamed) servlet instance it will be the servlet's class name.
     *
     * <p>返回 servlet 实例的名称。
     * 名称在 web 应用程序部署描述符中指定，或对于未注册(+未命名)的 servlet 实例将会使用 servlet 的类名。
     *
     * @return	the name of the servlet instance
     */
    String getServletName();


    /**
     * Returns a reference to the {@link ServletContext} in which the caller
     * is executing.
     *
     * <p>返回执行该调用方的 servlet 上下文的引用。
     *
     * @return	a {@link ServletContext} object, used
     * by the caller to interact with its servlet container (用于调用方与其 servlet 容器交互)
     * 
     * @see ServletContext
     */
    // 核心方法 获取执行该调用方的Servlet上下文
    ServletContext getServletContext();


    /**
     * Gets the value of the initialization parameter with the given name.
     *
     * <p>获取给定的初始化参数名称的值。
     *
     * @param name the name of the initialization parameter whose value to
     * get (初始化参数的名称)
     *
     * @return a <code>String</code> containing the value 
     * of the initialization parameter, or <code>null</code> if 
     * the initialization parameter does not exist
     */
    String getInitParameter(String name);


    /**
     * Returns the names of the servlet's initialization parameters
     * as an <code>Enumeration</code> of <code>String</code> objects,
     * or an empty <code>Enumeration</code> if the servlet has
     * no initialization parameters.
     *
     * <p>返回 servlet 初始化参数的名称列表。
     *
     * @return an <code>Enumeration</code> of <code>String</code>
     * objects containing the names of the servlet's 
     * initialization parameters
     */
    Enumeration<String> getInitParameterNames();

}
