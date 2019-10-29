/*
 * generated by Xtext 2.19.0
 */
grammar InternalSelenium;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.SeleniumGrammarAccess;

}

@parser::members {

 	private SeleniumGrammarAccess grammarAccess;

    public InternalSeleniumParser(TokenStream input, SeleniumGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Global";
   	}

   	@Override
   	protected SeleniumGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGlobal
entryRuleGlobal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGlobalRule()); }
	iv_ruleGlobal=ruleGlobal
	{ $current=$iv_ruleGlobal.current; }
	EOF;

// Rule Global
ruleGlobal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getGlobalAccess().getProgramsProgramParserRuleCall_0());
			}
			lv_programs_0_0=ruleProgram
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getGlobalRule());
				}
				add(
					$current,
					"programs",
					lv_programs_0_0,
					"org.xtext.example.mydsl.Selenium.Program");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleProgram
entryRuleProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProgramRule()); }
	iv_ruleProgram=ruleProgram
	{ $current=$iv_ruleProgram.current; }
	EOF;

// Rule Program
ruleProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getProgramAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProgramRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='returns'
		{
			newLeafNode(otherlv_1, grammarAccess.getProgramAccess().getReturnsKeyword_1());
		}
		(
			(
				(
					lv_ret_2_1='true'
					{
						newLeafNode(lv_ret_2_1, grammarAccess.getProgramAccess().getRetTrueKeyword_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProgramRule());
						}
						setWithLastConsumed($current, "ret", lv_ret_2_1, null);
					}
					    |
					lv_ret_2_2='false'
					{
						newLeafNode(lv_ret_2_2, grammarAccess.getProgramAccess().getRetFalseKeyword_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getProgramRule());
						}
						setWithLastConsumed($current, "ret", lv_ret_2_2, null);
					}
				)
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getProgramAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='open;'
		{
			newLeafNode(otherlv_4, grammarAccess.getProgramAccess().getOpenKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getProgramAccess().getInsInstructionParserRuleCall_5_0());
				}
				lv_ins_5_0=ruleInstruction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProgramRule());
					}
					add(
						$current,
						"ins",
						lv_ins_5_0,
						"org.xtext.example.mydsl.Selenium.Instruction");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getProgramAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleInstruction
entryRuleInstruction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstructionRule()); }
	iv_ruleInstruction=ruleInstruction
	{ $current=$iv_ruleInstruction.current; }
	EOF;

// Rule Instruction
ruleInstruction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getGoParserRuleCall_0_0());
			}
			this_Go_0=ruleGo
			{
				$current = $this_Go_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getVerifyParserRuleCall_0_1());
			}
			this_Verify_1=ruleVerify
			{
				$current = $this_Verify_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getClickParserRuleCall_0_2());
			}
			this_Click_2=ruleClick
			{
				$current = $this_Click_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getFillTextParserRuleCall_0_3());
			}
			this_FillText_3=ruleFillText
			{
				$current = $this_FillText_3.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getCheckParserRuleCall_0_4());
			}
			this_Check_4=ruleCheck
			{
				$current = $this_Check_4.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getSelectComboParserRuleCall_0_5());
			}
			this_SelectCombo_5=ruleSelectCombo
			{
				$current = $this_SelectCombo_5.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getInstructionAccess().getVariableParserRuleCall_0_6());
			}
			this_Variable_6=ruleVariable
			{
				$current = $this_Variable_6.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleGo
entryRuleGo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGoRule()); }
	iv_ruleGo=ruleGo
	{ $current=$iv_ruleGo.current; }
	EOF;

// Rule Go
ruleGo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='goto:'
		{
			newLeafNode(otherlv_0, grammarAccess.getGoAccess().getGotoKeyword_0());
		}
		(
			(
				lv_url_1_0=RULE_STRING
				{
					newLeafNode(lv_url_1_0, grammarAccess.getGoAccess().getUrlSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGoRule());
					}
					setWithLastConsumed(
						$current,
						"url",
						lv_url_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleVerify
entryRuleVerify returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVerifyRule()); }
	iv_ruleVerify=ruleVerify
	{ $current=$iv_ruleVerify.current; }
	EOF;

// Rule Verify
ruleVerify returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='verify:'
		{
			newLeafNode(otherlv_0, grammarAccess.getVerifyAccess().getVerifyKeyword_0());
		}
		(
			otherlv_1='page'
			{
				newLeafNode(otherlv_1, grammarAccess.getVerifyAccess().getPageKeyword_1_0());
			}
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVerifyAccess().getElemElementParserRuleCall_1_1_0());
					}
					lv_elem_2_0=ruleElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVerifyRule());
						}
						set(
							$current,
							"elem",
							lv_elem_2_0,
							"org.xtext.example.mydsl.Selenium.Element");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		otherlv_3='contains'
		{
			newLeafNode(otherlv_3, grammarAccess.getVerifyAccess().getContainsKeyword_2());
		}
		(
			(
				(
					lv_text_4_0=RULE_STRING
					{
						newLeafNode(lv_text_4_0, grammarAccess.getVerifyAccess().getTextSTRINGTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVerifyRule());
						}
						setWithLastConsumed(
							$current,
							"text",
							lv_text_4_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				otherlv_5='['
				{
					newLeafNode(otherlv_5, grammarAccess.getVerifyAccess().getLeftSquareBracketKeyword_3_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVerifyRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getVerifyAccess().getVarVariableCrossReference_3_1_1_0());
						}
					)
				)
				otherlv_7=']'
				{
					newLeafNode(otherlv_7, grammarAccess.getVerifyAccess().getRightSquareBracketKeyword_3_1_2());
				}
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getVerifyAccess().getElementElementParserRuleCall_3_2_0());
					}
					lv_Element_8_0=ruleElement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVerifyRule());
						}
						set(
							$current,
							"Element",
							lv_Element_8_0,
							"org.xtext.example.mydsl.Selenium.Element");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleFillText
entryRuleFillText returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFillTextRule()); }
	iv_ruleFillText=ruleFillText
	{ $current=$iv_ruleFillText.current; }
	EOF;

// Rule FillText
ruleFillText returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fill:'
		{
			newLeafNode(otherlv_0, grammarAccess.getFillTextAccess().getFillKeyword_0());
		}
		(
			(
				(
					lv_text_1_0=RULE_STRING
					{
						newLeafNode(lv_text_1_0, grammarAccess.getFillTextAccess().getTextSTRINGTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFillTextRule());
						}
						setWithLastConsumed(
							$current,
							"text",
							lv_text_1_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getFillTextAccess().getLeftSquareBracketKeyword_1_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getFillTextRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getFillTextAccess().getVarVariableCrossReference_1_1_1_0());
						}
					)
				)
				otherlv_4=']'
				{
					newLeafNode(otherlv_4, grammarAccess.getFillTextAccess().getRightSquareBracketKeyword_1_1_2());
				}
			)
		)
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getFillTextAccess().getInKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFillTextAccess().getPropByPropertyParserRuleCall_3_0());
				}
				lv_prop_6_0=ruleByProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFillTextRule());
					}
					set(
						$current,
						"prop",
						lv_prop_6_0,
						"org.xtext.example.mydsl.Selenium.ByProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_target_7_0=RULE_STRING
				{
					newLeafNode(lv_target_7_0, grammarAccess.getFillTextAccess().getTargetSTRINGTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFillTextRule());
					}
					setWithLastConsumed(
						$current,
						"target",
						lv_target_7_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getEqualsSignKeyword_2());
		}
		(
			otherlv_3='text'
			{
				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getTextKeyword_3_0());
			}
			    |
			(
				otherlv_4='property'
				{
					newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getPropertyKeyword_3_1_0());
				}
				(
					(
						lv_attr_5_0=RULE_STRING
						{
							newLeafNode(lv_attr_5_0, grammarAccess.getVariableAccess().getAttrSTRINGTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getVariableRule());
							}
							setWithLastConsumed(
								$current,
								"attr",
								lv_attr_5_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
		otherlv_6='of'
		{
			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getOfKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getElemElementParserRuleCall_5_0());
				}
				lv_elem_7_0=ruleElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"elem",
						lv_elem_7_0,
						"org.xtext.example.mydsl.Selenium.Element");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleClick
entryRuleClick returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClickRule()); }
	iv_ruleClick=ruleClick
	{ $current=$iv_ruleClick.current; }
	EOF;

// Rule Click
ruleClick returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='click:'
		{
			newLeafNode(otherlv_0, grammarAccess.getClickAccess().getClickKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getClickAccess().getElementParserRuleCall_1());
		}
		this_Element_1=ruleElement
		{
			$current = $this_Element_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleCheck
entryRuleCheck returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCheckRule()); }
	iv_ruleCheck=ruleCheck
	{ $current=$iv_ruleCheck.current; }
	EOF;

// Rule Check
ruleCheck returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='check:'
		{
			newLeafNode(otherlv_0, grammarAccess.getCheckAccess().getCheckKeyword_0());
		}
		(
			otherlv_1='all'
			{
				newLeafNode(otherlv_1, grammarAccess.getCheckAccess().getAllKeyword_1_0());
			}
			    |
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getCheckAccess().getByByParserRuleCall_1_1_0_0());
						}
						lv_by_2_0=ruleBy
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCheckRule());
							}
							set(
								$current,
								"by",
								lv_by_2_0,
								"org.xtext.example.mydsl.Selenium.By");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					(
						lv_target_3_0=RULE_STRING
						{
							newLeafNode(lv_target_3_0, grammarAccess.getCheckAccess().getTargetSTRINGTerminalRuleCall_1_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCheckRule());
							}
							setWithLastConsumed(
								$current,
								"target",
								lv_target_3_0,
								"org.eclipse.xtext.common.Terminals.STRING");
						}
					)
				)
			)
		)
		(
			otherlv_4='on'
			{
				newLeafNode(otherlv_4, grammarAccess.getCheckAccess().getOnKeyword_2_0());
			}
			    |
			otherlv_5='off'
			{
				newLeafNode(otherlv_5, grammarAccess.getCheckAccess().getOffKeyword_2_1());
			}
		)
	)
;

// Entry rule entryRuleSelectCombo
entryRuleSelectCombo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectComboRule()); }
	iv_ruleSelectCombo=ruleSelectCombo
	{ $current=$iv_ruleSelectCombo.current; }
	EOF;

// Rule SelectCombo
ruleSelectCombo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='select-combo:'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelectComboAccess().getSelectComboKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelectComboAccess().getByByParserRuleCall_1_0());
				}
				lv_by_1_0=ruleBy
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelectComboRule());
					}
					set(
						$current,
						"by",
						lv_by_1_0,
						"org.xtext.example.mydsl.Selenium.By");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_target_2_0=RULE_STRING
				{
					newLeafNode(lv_target_2_0, grammarAccess.getSelectComboAccess().getTargetSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelectComboRule());
					}
					setWithLastConsumed(
						$current,
						"target",
						lv_target_2_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleElement
entryRuleElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getElementRule()); }
	iv_ruleElement=ruleElement
	{ $current=$iv_ruleElement.current; }
	EOF;

// Rule Element
ruleElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getTypeTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"org.xtext.example.mydsl.Selenium.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_1='n\u00B0'
			{
				newLeafNode(otherlv_1, grammarAccess.getElementAccess().getNKeyword_1_0());
			}
			(
				(
					lv_number_2_0=RULE_INT
					{
						newLeafNode(lv_number_2_0, grammarAccess.getElementAccess().getNumberINTTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"number",
							lv_number_2_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)?
		otherlv_3='where'
		{
			newLeafNode(otherlv_3, grammarAccess.getElementAccess().getWhereKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getElementAccess().getSelectorByParserRuleCall_3_0());
				}
				lv_selector_4_0=ruleBy
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getElementRule());
					}
					set(
						$current,
						"selector",
						lv_selector_4_0,
						"org.xtext.example.mydsl.Selenium.By");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					lv_target_5_0=RULE_STRING
					{
						newLeafNode(lv_target_5_0, grammarAccess.getElementAccess().getTargetSTRINGTerminalRuleCall_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getElementRule());
						}
						setWithLastConsumed(
							$current,
							"target",
							lv_target_5_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			    |
			(
				otherlv_6='['
				{
					newLeafNode(otherlv_6, grammarAccess.getElementAccess().getLeftSquareBracketKeyword_4_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getElementRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getElementAccess().getVarVariableCrossReference_4_1_1_0());
						}
					)
				)
				otherlv_8=']'
				{
					newLeafNode(otherlv_8, grammarAccess.getElementAccess().getRightSquareBracketKeyword_4_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleBy
entryRuleBy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getByRule()); }
	iv_ruleBy=ruleBy
	{ $current=$iv_ruleBy.current; }
	EOF;

// Rule By
ruleBy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='text='
		{
			newLeafNode(otherlv_0, grammarAccess.getByAccess().getTextKeyword_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getByAccess().getByPropertyParserRuleCall_1());
		}
		this_ByProperty_1=ruleByProperty
		{
			$current = $this_ByProperty_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleByProperty
entryRuleByProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getByPropertyRule()); }
	iv_ruleByProperty=ruleByProperty
	{ $current=$iv_ruleByProperty.current; }
	EOF;

// Rule ByProperty
ruleByProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='property'
		{
			newLeafNode(otherlv_0, grammarAccess.getByPropertyAccess().getPropertyKeyword_0());
		}
		(
			(
				lv_property_1_0=RULE_STRING
				{
					newLeafNode(lv_property_1_0, grammarAccess.getByPropertyAccess().getPropertySTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getByPropertyRule());
					}
					addWithLastConsumed(
						$current,
						"property",
						lv_property_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getByPropertyAccess().getEqualsSignKeyword_2());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current.getText(); }
	EOF;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='image'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getImageKeyword_0());
		}
		    |
		kw='link'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getLinkKeyword_1());
		}
		    |
		kw='button'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getButtonKeyword_2());
		}
		    |
		kw='anything'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getTypeAccess().getAnythingKeyword_3());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;