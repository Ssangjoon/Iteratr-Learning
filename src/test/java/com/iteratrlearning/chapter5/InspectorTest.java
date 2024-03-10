package com.iteratrlearning.chapter5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InspectorTest {

    @Test
    public void inspectOneCOnditionEvaluatesTrue(){
        final Facts facts = new Facts();
        facts.setFact("jobTitle", "CEO");
        final ConditionalAction conditionalAction = new JobTitleCondition();
        final Inspector inspector = new Inspector(conditionalAction);

        final List<Diagnosis>  diagnosisList = inspector.inspect(facts);

        assertEquals(1,diagnosisList.size());
        assertEquals(true, diagnosisList.get(0).isPositive());
    }
    private static class JobTitleCondition implements  ConditionalAction{

        @Override
        public void perform(Facts facts) {
            throw new UnsupportedOperationException();
        }

        @Override
        public boolean evaluate(Facts facts) {
            return "CEO".equals(facts.getFact("jobTitle"));
        }
    }
//    @Test
//    public void shouldHaveNoRulesInitially() {
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//        assertEquals(0, businessRuleEngine.count());
//    }
//    @Test
//    public void shouldAddTwoActions() {
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//
//        businessRuleEngine.addAction(facts -> {
//            var dealStage = Stage.valueOf(facts.getFact("stage"));
//            var amount = Double.parseDouble(facts.getFact("amount"));
//            var forecatedAmount = amount * switch (dealStage){
//                case LEAD -> 0.2;
//                case EVALUATING -> 0.5;
//                case INTERESTED -> 0.8;
//                case CLOSED -> 1;
//            };
//            facts.setFact("forecastedAmount", String.valueOf(forecatedAmount));
//        });
//
//        assertEquals(2, businessRuleEngine.count());
//    }
//    @Test
//    public void shouldExecuteOneAction(){
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine();
//        final Action mockAction = mock(Action.class);
//
//        businessRuleEngine.addAction(mockAction);
//        businessRuleEngine.run();
//
//        verify(mockAction).execute();
//    }
//    @Test
//    public void shouldPerformAnActionWithFacts(){
//        final Action mockAction = mock(Action.class);
//        final Facts mockFacts = mock(Facts.class);
//        final BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);
//
//        businessRuleEngine.addAction(mockAction);
//        businessRuleEngine.run();
//
//        verify(mockAction).execute(mockFacts);
//    }
}
