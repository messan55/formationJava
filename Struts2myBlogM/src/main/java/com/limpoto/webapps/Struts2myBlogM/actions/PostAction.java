package com.limpoto.webapps.Struts2myBlogM.actions;

	import java.util.Date;
	import java.util.List;

	import javax.servlet.ServletContext;

	import org.apache.struts2.util.ServletContextAware;

	import com.limpoto.webapps.Struts2myPostM.beans.Post;
	import com.limpoto.webapps.Struts2myPostM.utils.PostDAO;
	import com.opensymphony.xwork2.ActionSupport;

	public class PostAction extends ActionSupport implements ServletContextAware
	{
		
		private List<Post> posts;
		private int postId;
		private String postTitre;
		private String postCorps;
		private Date postDate;
		private PostDAO postDAO;
		
		private ServletContext ctx;
		@Override
		public void setServletContext(ServletContext arg0) {
			ctx = arg0;
			postDAO = (PostDAO)ctx.getAttribute("postDAO");
		}
		
		/*
		 * getter/setter pour edition client
		 * 
		 */
		
		public List<Post> getPosts() {
			return posts;
		}

		public void setPosts(List<Post> post) {
			this.posts = post;
		}

		public int getPostId() {
			return postId;
		}

		public void setPostId(int postId) {
			this.postId = postId;
		}

		public String getPostTitre() {
			return postTitre;
		}

		public void setPostTitre(String postTitre) {
			this.postTitre = postTitre;
		}

		public String getPostCorps() {
			return postCorps;
		}

		public void setPostCorps(String postCorps) {
			this.postCorps = postCorps;
		}

		public Date getPostDate() {
			return postDate;
		}

		public void setPostDate(Date postDate) {
			this.postDate = postDate;
		}

		public PostDAO getPostDAO() {
			return postDAO;
		}

		public void setPostDAO(PostDAO postDAO) {
			this.postDAO = postDAO;
		}
		
		/*
		 * actions
		 */
		
		public String liste() {
			System.out.println("dans liste de posts");
			posts = postDAO.findAll();
			return SUCCESS;
		}
		
		public String edit() {
			System.out.println("post id = " + getPostId());
			Post c = postDAO.findByID(getPostId());
			if (c == null)
				return "notfound";
			setPostTitre(c.getTitre());
			setPostCorps(c.getCorps());
			setPostDate(c.getDateCreation());
			return SUCCESS;
		}
		
		public String save() {
//			if (getPostNom().equals("toto")) {
//				addFieldError("clientNom", "vous ne pouvez pas entrez la chaine toto");
//				addActionError("veuillez entrer des données cohérentes");
//				return INPUT;
//			}
//			else{
				Post c = new Post(getPostId(), getPostTitre(), getPostCorps(), getPostDate());
				postDAO.save(c);
				return SUCCESS;
//			}
		}

	}

