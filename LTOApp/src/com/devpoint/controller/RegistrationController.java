package com.devpoint.controller;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.devpoint.dao.UserDao;
import com.devpoint.model.User;
import com.devpoint.utility.Response;

@Path("/registration")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegistrationController {
	@Autowired
	UserDao userDao;

	@POST
	@Path("/insert")
	@Produces(MediaType.APPLICATION_JSON)
	public Response insert(User user) {
		try {
			User userAccount = new User("12345", "", "", "", "", "", "",
					"", new Date(), 0.0, 0.0, "", "", "", "", "", false, "", "",
					"", "", "", "", "", "", "", "", "", "", "");
			user = userDao.createUser(userAccount);
			Response response = new Response();
			response.setStatus("1");
			response.setDataParam(user);
			response.setMessage("success");

			return response;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
