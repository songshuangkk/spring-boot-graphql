package com.songshuang.springbootgraphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.songshuang.springbootgraphql.model.Post;

import java.util.List;

public class Query implements GraphQLQueryResolver {

  private PostDao postDao;

  public List<Post> getRecentPosts(int count, int offset) {
    return postsDao.getRecentPosts(count, offset);
  }
}
