package com.narayana.UrineSodium;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

@Repository
public class UrineSodiumImpl implements UrineSodiumRepository {
	protected Logger logger = Logger
			.getLogger(UrineSodiumImpl.class.getName());


	@Override
	public String getUrineSodium(String urineSodium) {
		if(Integer.parseInt(urineSodium)==1) {
			
			return "lowUrineSodium";
			}
		else {
			return "highUrineSodium";
		}
		}
			
			}
