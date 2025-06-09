/*
 * Copyright 2010-2020 M16, Inc. All rights reserved.
 * This software and documentation contain valuable trade
 * secrets and proprietary property belonging to M16, Inc.
 * None of this software and documentation may be copied,
 * duplicated or disclosed without the express
 * written permission of M16, Inc.
 */

package com.flightBooking.resource;

import platform.webservice.BasePossibleValue;
import platform.webservice.Enum;

/*
 ********** This is a generated class Don't modify it.Extend this file for additional functionality **********
 * 
 */
public class Priority extends BasePossibleValue {
		public static String ID_Low = "Low";
		public static String NAME_Low = "Low";
		public static String ID_Medium = "Medium";
		public static String NAME_Medium = "Medium";
		public static String ID_High = "High";
		public static String NAME_High = "High";
		public Priority() {super("PRIORITY");}
		protected void populate() {
 			add(new Enum(ID_Low,NAME_Low));
 			add(new Enum(ID_Medium,NAME_Medium));
 			add(new Enum(ID_High,NAME_High));
		}
}