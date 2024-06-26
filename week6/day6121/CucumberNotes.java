package week6.day6121;

public class CucumberNotes {

}

/*
* Cucumber Framework - Important Framework
* BDD - Behavior Driven Development
* What is BDD? Software Development Approach
* How was the development happened traditional way of methodologies like waterfall, v model methodologies
* We are using Agile Methodology
* In Waterfall model, there will be different phases
* -> Requirement gathering & analysis, design, implementation, testing, deployment, maintainance
* S/w development phases are executed in a cascading manner, which means one by one
* Each phase will be done by different team, these functions are worked as an isolated team and they meet only during the meeting
* The requirement will be given to both developers and testers, they will understand the requirement separately
* and implement based on their understanding
* Here, a particular requirement would be understood by developers and testers in different way
* This will lead to the occurence of defect
* If there are lot of defect there will some impact -> Time & Money consuming
* Industry wants to address this problem and they come up with a solution called TDD
* 
* TDD - Test Driven Development
* In TDD approach, once the requirement is ready, testers will write the TC's based on the requirement
* Once the TC is ready, team will review the TC's and approve
* Once the TC's are approved, developed will start develop the product based on the testcases
* So testcase is driving the development
* Once this gets going, industry want to check whether this approach is working fine or not
* In Agile, there is a concept called inspect and adapt.
* If yu want to do anything innovative in your team, or any new things yu want to do new things, yu should start doing that
* After starting it, yu shouldn't continue for so long. Yu should inspect whether it is going fine
* If it is going fine, u can continue, otherwise yu have to take necessary steps to improve
* Here, industry inspected and found lot of negative scenarios in TDD, rather than positive scenarios, which is a big problem
* Positive scenarios are regularly used by customers in the application
* eg: Login, customer provide right uname and pwd most of the time, but sometimes they provide negative scenarios
* Industry wants to address this issue, so they came up with ATDD
* 
* ATDD - Acceptance Test Driven Development
* In ATDD, they write acceptance testcases, user acceptance testcases will be written by business team
* Business team will first write the user acceptance testcases and develop the product based on the acceptance scenarios
* UAT testcases will mostly have the positive scenarios, UAT TC's written by testers and business will be different
* Then they reviewed ATDD, they found a problem
* If yu look into BRD, they use stamps which won't be understood by Technical team, as the business team non tech team
* The language used by business was not understood by technical team
* So they want to address the communication gap b/w the business team & technical team
* To address the communication gap, they came up with a solution called BDD
* 
* BDD -Approach to solve the communication gap b/w tech team and the non tech team
* In BDD, they used a language called Gherkin
* Main purpose of BDD is to get the words, however the non tech(business) team think of a requirement, 
* the same way project stakeholders should understand the words
* Getting the words right is the focus of BDD, leading to building one langugae that is understood the same way
* by the project stakeholders, Vision is to bring consistency, accuracy and meaning
* eg: However the trainer teaches, we should understand it in the same way
* Gherkin is the language that cucumber understands. It is a Business Readable, Domain Specific Language
* Cucumber is one of the BDD framework, it also unerstands the Gherkin language
* BDD Automation Tools
* Java                                    C#
* Cucumber                                SpecFlow
* JBehave
* JDave
* FitNesse
* Concordian
* All these BDD framework will understand the Gherkin language
* Jherkin language is nothing but the below keywords
* Keywords
* 
* 1. Feature                    6. Then                   9. Scenario Outline
* 2. Background                 7. And                    10. Examples
* 3. Scenario                   8. But
* 4. Given
* 5. When
* 
* Go to CucumberLayerNotes class for next set of learnings
*/