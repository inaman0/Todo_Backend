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
public class Status extends BasePossibleValue {
		public static String ID_To_do = "To do";
		public static String NAME_To_do = "To do";
		public static String ID_In_progress = "In progress";
		public static String NAME_In_progress = "In progress";
		public static String ID_Done = "Done";
		public static String NAME_Done = "Done";
		public Status() {super("STATUS");}
		protected void populate() {
 			add(new Enum(ID_To_do,NAME_To_do));
 			add(new Enum(ID_In_progress,NAME_In_progress));
 			add(new Enum(ID_Done,NAME_Done));
		}
}