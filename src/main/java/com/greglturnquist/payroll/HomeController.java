/*
 * Copyright 2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.greglturnquist.payroll;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * @author Greg Turnquist
 */
// tag::code[]
@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index(Map<String, Object> model) throws JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();

		ObjectNode objectNode1 = mapper.createObjectNode();
        objectNode1.put("name", "Ricky Ponting");       
        
		model.put("data", objectNode1.toString());

		return "index";
	}

}
// end::code[]