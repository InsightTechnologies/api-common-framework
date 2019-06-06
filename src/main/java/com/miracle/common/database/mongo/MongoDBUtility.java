//package com.miracle.common.database.mongo;
//
//import static com.mongodb.client.model.Filters.and;
//import static com.mongodb.client.model.Filters.eq;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.bson.Document;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.miracle.database.bean.Filter;
//import com.miracle.database.bean.Scrum;
//import com.miracle.database.bean.Status;
//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//@Component
//public class MongoDBUtility {
//	@Autowired
//	private MongoDBConnectionDetails mongoDBConnectionDetails;
//
//	/**
//	 * 
//	 * @param mongoDBConnectionDetails
//	 * @return
//	 * @throws Exception
//	 */
//	private MongoClient getMongoDBClient(MongoDBConnectionDetails mongoDBConnectionDetails) throws Exception {
////		MongoClientOptions.Builder options = MongoClientOptions.builder().sslEnabled(true)
////				.sslInvalidHostNameAllowed(true);
////		String uri = "mongodb://" + mongoDBConnectionDetails.getUserName() + ":"
////				+ mongoDBConnectionDetails.getPassword() + "@" + mongoDBConnectionDetails.getHostname() + ":"
////				+ mongoDBConnectionDetails.getPort() + "/" + mongoDBConnectionDetails.getDatabase();
//		//-----------------------
////		MongoClientOptions.Builder options = MongoClientOptions.builder().sslEnabled(true);
////		String uri = "mongodb://"+ mongoDBConnectionDetails.getHostname() + ":"
////				+ mongoDBConnectionDetails.getPort() + "/" + mongoDBConnectionDetails.getDatabase();
////		System.out.println("URI :: " + uri);
////		MongoClient mongoClient = new MongoClient(new MongoClientURI(uri, options));
//		//-*--------------------
//		MongoClient client = new MongoClient("localhost", 27017 );
//		System.out.println("connected");
//		//Get the Databases Present in the MongoDB
//		
//
//		return client;
//	}
//
//	/**
//	 * 
//	 * @param mongoDB
//	 * @param collectionName
//	 * @param Object
//	 * @param ObjectType
//	 * @return
//	 */
//	public MongoCollection<Document> getDocumentList(MongoClient mongoClient, String databaseName,
//			String collectionName) {
//		MongoCollection<Document> collection = mongoClient.getDatabase(databaseName).getCollection(collectionName);
//		return collection;
//	}
//
//	public List<Scrum> extractScrum(MongoClient mongoClient, String databaseName, String collectionName)
//			throws Exception {
//		List<Scrum> filterList = new ArrayList<Scrum>();
//		MongoCollection<Document> documents = getDocumentList(mongoClient, databaseName, collectionName);
//		Gson gson = new GsonBuilder().create();
//		List<Document> documentList = (List<Document>) documents.find().into(new ArrayList<Document>());
//		documentList.forEach(doc -> {
//			filterList.add(gson.fromJson(doc.toJson(), Scrum.class));
//		});
//		return filterList;
//	}
//	
//	/**
//	 * 
//	 * @param mongoClient
//	 * @param databaseName
//	 * @param collectionName
//	 * @return
//	 * @throws Exception
//	 */
//	public List<Filter> extractFilter(MongoClient mongoClient, String databaseName, String collectionName)
//			throws Exception {
//		List<Filter> filterList = new ArrayList<Filter>();
//		MongoCollection<Document> documents = getDocumentList(mongoClient, databaseName, collectionName);
//		Gson gson = new GsonBuilder().create();
//		List<Document> documentList = (List<Document>) documents.find().into(new ArrayList<Document>());
//		documentList.forEach(doc -> {
//			filterList.add(gson.fromJson(doc.toJson(), Filter.class));
//		});
//		// System.out.println(filterList);
//		return filterList;
//	}
//	/**
//	 * 
//	 * @param mongoClient
//	 * @param databaseName
//	 * @param collectionName
//	 * @param Object
//	 * @param type
//	 * @return
//	 * @throws Exception
//	 */
//	public List<Status> getStatus(MongoClient mongoClient, String databaseName, String collectionName, String Object,
//			String type) throws Exception {
//		List<Status> statusList = new ArrayList<Status>();
//		MongoCollection<Document> documents = getDocumentList(mongoClient, databaseName, collectionName);
//		Gson gson = new GsonBuilder().create();
//		List<Document> documentList = (List<Document>) documents.find(and(eq("object", Object), eq("type", type)))
//				.into(new ArrayList<Document>());
//		// List<Document> documentList = (List<Document>) documents.find().into(new
//		// ArrayList<Document>());
//		documentList.forEach(doc -> {
//			statusList.add(gson.fromJson(doc.toJson(), Status.class));
//		});
//		// System.out.println(filterList);
//		return statusList;
//	}
//	/**
//	 * 
//	 * @param mongoClient
//	 * @param databaseName
//	 * @param collectionName
//	 * @param Object
//	 * @param type
//	 * @param statusValues
//	 * @return
//	 * @throws Exception
//	 */
//	public List<Status> getStatus(MongoClient mongoClient, String databaseName, String collectionName, String Object,
//			String type, List<String> statusValues) throws Exception {
//		List<Status> statusList = new ArrayList<Status>();
//		MongoCollection<Document> documents = getDocumentList(mongoClient, databaseName, collectionName);
//		Gson gson = new GsonBuilder().create();
//		List<Document> documentList = (List<Document>) documents.find(and(eq("object", Object), eq("type", type)))
//				.into(new ArrayList<Document>());
//		// List<Document> documentList = (List<Document>) documents.find().into(new
//		// ArrayList<Document>());
//		documentList.forEach(doc -> {
//			statusList.add(gson.fromJson(doc.toJson(), Status.class));
//		});
//		List<Status> filteredStatusIds = new ArrayList<Status>();
//		statusList.forEach(state->{
//			for (String statusValue : statusValues) {
//				if(statusValue.equalsIgnoreCase(state.getStatusValue()))
//				{
//					filteredStatusIds.add(state);	
//					break;
//				}
//			}
//		});
//		return filteredStatusIds;
//	}
//	/**
//	 * 
//	 * @param storyStates
//	 * @return
//	 * @throws Exception
//	 */
//	public List<String> getStoryStates(List<String> storyStates)throws Exception {
//		List<String> storyStateList = new ArrayList<String>();
//		
//		MongoDBConnectionDetails mongoDBConnectionDetails = new MongoDBConnectionDetails();
//		List<Status> storyStatus = getStatus(getMongoDBClient(mongoDBConnectionDetails), "icescrum", "status", "Story", "state", storyStates);
//		for(Status status : storyStatus)
//		{
//			storyStateList.add(Integer.valueOf(status.getStatusId()).toString());
//		}
//		return storyStateList;
//	}
//	/**
//	 * 
//	 * @param featureStates
//	 * @return
//	 * @throws Exception
//	 */
//	public List<String> getFeatureStates(List<String> featureStates)throws Exception {
//		List<String> storyStateList = new ArrayList<String>();
//		
//		MongoDBConnectionDetails mongoDBConnectionDetails = new MongoDBConnectionDetails();
//		List<Status> storyStatus = getStatus(getMongoDBClient(mongoDBConnectionDetails), "icescrum", "status", "Feature", "state", featureStates);
//		for(Status status : storyStatus)
//		{
//			storyStateList.add(Integer.valueOf(status.getStatusId()).toString());
//		}
//		return storyStateList;
//	}
//	
//	public Map<String, String> getScrumHeaderDetails()throws Exception
//	{
//		List<Scrum> scrumDetails = extractScrum(getMongoDBClient(mongoDBConnectionDetails), "icescrum", "scrum");
//		 Map<String, String> headerDetails = new HashMap<String, String>();
//	
//		 for(Scrum scrum : scrumDetails)
//			{
//			 String[] scrumMetadataDetails = scrum.getToken().split("\\=");
//			 if(scrumMetadataDetails.length ==2)
//			 {
//				 headerDetails.put(scrumMetadataDetails[0], scrumMetadataDetails[1]);
//			 }
//			}
//	
//		 return headerDetails;
//	}
//	
//	public  String getAPIEndPoint()throws Exception
//	{
//		String apiEndpoint = "";
//		List<Scrum> scrumDetails = extractScrum(getMongoDBClient(mongoDBConnectionDetails), "icescrum", "scrum");
//		if(scrumDetails.size() > 0) {
//			apiEndpoint = scrumDetails.get(0).getApiEndpoint();
//		}
//		return apiEndpoint;
//		
//	}
//	
//	public String getFilterType(int filterID)throws Exception
//	{
//		String filterType = "";
//		List<Filter> filterTypes= extractFilter(getMongoDBClient(mongoDBConnectionDetails), "icescrum", "filter");
//		int i=0;
//		for (Filter filter : filterTypes) {
//			if(i== filterID || filter.getId() ==filterID)
//			{
//				filterType =filter.getFilterType();
//				break;
//			}
//			i++;
//		}
//		return filterType;
//	}
//	public static void main(String[] args)throws Exception {
//		List<String> statusValues  = new ArrayList<String>();
//		statusValues.add("suggested");
//		statusValues.add("accepted");
//		statusValues.add("estimated");
//		statusValues.add("planned");
//		statusValues.add("in review");
//		statusValues.add("in progress");
//		statusValues.add("done");
//		statusValues.add("frozen");		
//		MongoDBUtility mongoDBUtility= new MongoDBUtility();
//		System.out.println("Story Sate :: "+mongoDBUtility.getStoryStates(statusValues));
//		
//		List<String> featureStates = new ArrayList<String>();
//		featureStates.add("done");
//		featureStates.add("todo");
//		featureStates.add("in progress");
//		System.out.println("Feature Sate :: "+mongoDBUtility.getFeatureStates(featureStates));
//		
//		Map<String, String> headerDetails = mongoDBUtility.getScrumHeaderDetails();
//		System.out.println(headerDetails);
//		
//		System.out.println(mongoDBUtility.getAPIEndPoint());
//		
//		System.out.println("Filter Type :: "+mongoDBUtility.getFilterType(1));
//				
//		
//	}
//}
