package com.example.blog.server.service;

import com.example.blog.server.entity.Details;

import java.util.List;
import java.util.Map;

public interface DealingService {
    Details details();
    Map<String, List> home();
}
