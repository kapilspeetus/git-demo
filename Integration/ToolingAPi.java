/services/data/v28.0/tooling/sobjects/MetadataContainer/	{"Name":"TriggerMContainer"}														=> return (ID)MetadataContainerId
/services/data/v28.0/tooling/sobjects/ApexTriggerMember/	{"MetadataContainerId":"1dc2w000006UuMzAAK","ContentEntityId" : TriggerID, "Metadata": { "status": "Inactive"} }	

// Create a Trigger
String json = '{ "Name" : "AccountTrigger", "TableEnumOrId" : "Account", "Body" : "trigger AccountTrigger1 on Account (before insert) { for(Account objacc : trigger.new){}}" }';
Httprequest req = new HttpRequest();
req.setEndpoint(URL.getSalesforceBaseUrl().toExternalForm() + '/services/data/v27.0/sobjects/ApexTrigger');
req.setMethod('POST');
req.setHeader('Content-Type', 'application/json');
req.setHeader('Authorization', 'OAuth ' + UserInfo.getSessionId());
req.setBody(json); 
Http httpReq = new Http();
HttpResponse res = httpReq.send(req);
System.debug(res.getBody());
// 01q54000000ShJ9AAK

// Create container
Httprequest req =new HttpRequest();
req.setEndpoint(URL.getSalesforceBaseUrl().toExternalForm()+'/services/data/v28.0/tooling/sobjects/MetadataContainer/');
req.setHeader('Content-Type','application/json');
req.setHeader('Authorization','OAuth ' + UserInfo.getSessionId());
req.setMethod('POST');
req.setBody('{"Name":"TriggerMContainer"}');	//1dc2w000006UuNsAAK
Http httpReq =new Http();
HttpResponse res = httpReq.send(req);
System.debug(res.getBody());
// 1dc54000000bs2bAAA	01q2w000000VhXTAA0 1dc2w000006UuR6AAK


// Update Trigger
Httprequest req =new HttpRequest();
req.setEndpoint(URL.getSalesforceBaseUrl().toExternalForm()+'/services/data/v28.0/tooling/sobjects/ApexTriggerMember/');
req.setHeader('Content-Type','application/json');
req.setHeader('Authorization','OAuth ' + UserInfo.getSessionId());
req.setMethod('POST');
req.setBody('{"MetadataContainerId":"1dc54000000bs2bAAA","ContentEntityId" : "01q54000000ShJ9AAK", "Metadata": { "status": "Inactive"} }');
Http httpReq =new Http();
HttpResponse res = httpReq.send(req);
System.debug(res.getBody());


// Create Async
Httprequest req =new HttpRequest();
req.setEndpoint(URL.getSalesforceBaseUrl().toExternalForm()+'/services/data/v28.0/tooling/sobjects/ContainerAsyncRequest/');
req.setHeader('Content-Type','application/json');
req.setHeader('Authorization','OAuth ' + UserInfo.getSessionId());
req.setMethod('POST');
req.setBody('{"MetadataContainerId" : "1dc54000000bs2bAAA", "isCheckOnly": "false"}');
Http httpReq =new Http();
HttpResponse res = httpReq.send(req);
System.debug(res.getBody());
// 1dr54000001zhB4AAI

// Async Status
Httprequest req =new HttpRequest();
req.setEndpoint(URL.getSalesforceBaseUrl().toExternalForm()+'/services/data/v28.0/tooling/sobjects/ContainerAsyncRequest/1dr54000001zhB4AAI');
req.setHeader('Content-Type','application/json');
req.setHeader('Authorization','OAuth ' + UserInfo.getSessionId());
req.setMethod('GET');
Http httpReq =new Http();
HttpResponse res = httpReq.send(req);
System.debug(res.getBody());


Cant Deactive rigger using the tooling application
=> https://www.forcetalks.com/salesforce-topic/can-we-delete-trigger-through-through-tooling-api-in-salesforce/