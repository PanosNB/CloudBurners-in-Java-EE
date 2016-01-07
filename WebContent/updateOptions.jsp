<%
// Copyright 2016 the project authors as listed in the AUTHORS file.
// All rights reserved. Use of this source code is governed by the
// license that can be found in the LICENSE file.
 %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="cloudBurners.BurnerController,cloudBurners.BurnerOptions" %>
<%
	int burnerId = Integer.parseInt(request.getParameter("burnerId"));
	int nThreads = request.getParameter("nThreads")!=null?Integer.parseInt(request.getParameter("nThreads")):0;
	int totalSize = request.getParameter("totalSize")!=null?Integer.parseInt(request.getParameter("totalSize")):0;
	int componentSize = request.getParameter("componentSize")!=null?Integer.parseInt(request.getParameter("componentSize")):0;
	String url = request.getParameter("url");
	int port = request.getParameter("port")!=null?Integer.parseInt(request.getParameter("port")):0;

	BurnerController.burnerOptions[burnerId].nThreads = nThreads;
	BurnerController.burnerOptions[burnerId].totalSize = totalSize;
	BurnerController.burnerOptions[burnerId].componentSize = componentSize;
	BurnerController.burnerOptions[burnerId].url = url;
	BurnerController.burnerOptions[burnerId].port = port;
	
    response.sendRedirect("");
%>