package com.flightBooking;
import platform.helper.HelperManager;
import platform.webservice.ServiceManager;
import com.flightBooking.helper.*;
import com.flightBooking.service.*;
public class Registry {
		public static void register(){
				 HelperManager.getInstance().register(TaskHelper.getInstance());
				 HelperManager.getInstance().register(CourseeHelper.getInstance());
				 HelperManager.getInstance().register(UserHelper.getInstance());
				 ServiceManager.getInstance().register(new TaskService());
				 ServiceManager.getInstance().register(new CourseeService());
				 ServiceManager.getInstance().register(new UserService());
		}
}
