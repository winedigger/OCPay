package com.stormfives.admin.wallet.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionOrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTxHashIsNull() {
            addCriterion("tx_hash is null");
            return (Criteria) this;
        }

        public Criteria andTxHashIsNotNull() {
            addCriterion("tx_hash is not null");
            return (Criteria) this;
        }

        public Criteria andTxHashEqualTo(String value) {
            addCriterion("tx_hash =", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotEqualTo(String value) {
            addCriterion("tx_hash <>", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashGreaterThan(String value) {
            addCriterion("tx_hash >", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashGreaterThanOrEqualTo(String value) {
            addCriterion("tx_hash >=", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashLessThan(String value) {
            addCriterion("tx_hash <", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashLessThanOrEqualTo(String value) {
            addCriterion("tx_hash <=", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashLike(String value) {
            addCriterion("tx_hash like", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotLike(String value) {
            addCriterion("tx_hash not like", value, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashIn(List<String> values) {
            addCriterion("tx_hash in", values, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotIn(List<String> values) {
            addCriterion("tx_hash not in", values, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashBetween(String value1, String value2) {
            addCriterion("tx_hash between", value1, value2, "txHash");
            return (Criteria) this;
        }

        public Criteria andTxHashNotBetween(String value1, String value2) {
            addCriterion("tx_hash not between", value1, value2, "txHash");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNull() {
            addCriterion("from_address is null");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNotNull() {
            addCriterion("from_address is not null");
            return (Criteria) this;
        }

        public Criteria andFromAddressEqualTo(String value) {
            addCriterion("from_address =", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotEqualTo(String value) {
            addCriterion("from_address <>", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThan(String value) {
            addCriterion("from_address >", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_address >=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThan(String value) {
            addCriterion("from_address <", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThanOrEqualTo(String value) {
            addCriterion("from_address <=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLike(String value) {
            addCriterion("from_address like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotLike(String value) {
            addCriterion("from_address not like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressIn(List<String> values) {
            addCriterion("from_address in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotIn(List<String> values) {
            addCriterion("from_address not in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressBetween(String value1, String value2) {
            addCriterion("from_address between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotBetween(String value1, String value2) {
            addCriterion("from_address not between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNull() {
            addCriterion("to_address is null");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNotNull() {
            addCriterion("to_address is not null");
            return (Criteria) this;
        }

        public Criteria andToAddressEqualTo(String value) {
            addCriterion("to_address =", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotEqualTo(String value) {
            addCriterion("to_address <>", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThan(String value) {
            addCriterion("to_address >", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_address >=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThan(String value) {
            addCriterion("to_address <", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThanOrEqualTo(String value) {
            addCriterion("to_address <=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLike(String value) {
            addCriterion("to_address like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotLike(String value) {
            addCriterion("to_address not like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIn(List<String> values) {
            addCriterion("to_address in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotIn(List<String> values) {
            addCriterion("to_address not in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressBetween(String value1, String value2) {
            addCriterion("to_address between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotBetween(String value1, String value2) {
            addCriterion("to_address not between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andCoinNameIsNull() {
            addCriterion("coin_name is null");
            return (Criteria) this;
        }

        public Criteria andCoinNameIsNotNull() {
            addCriterion("coin_name is not null");
            return (Criteria) this;
        }

        public Criteria andCoinNameEqualTo(String value) {
            addCriterion("coin_name =", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotEqualTo(String value) {
            addCriterion("coin_name <>", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameGreaterThan(String value) {
            addCriterion("coin_name >", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameGreaterThanOrEqualTo(String value) {
            addCriterion("coin_name >=", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLessThan(String value) {
            addCriterion("coin_name <", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLessThanOrEqualTo(String value) {
            addCriterion("coin_name <=", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameLike(String value) {
            addCriterion("coin_name like", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotLike(String value) {
            addCriterion("coin_name not like", value, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameIn(List<String> values) {
            addCriterion("coin_name in", values, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotIn(List<String> values) {
            addCriterion("coin_name not in", values, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameBetween(String value1, String value2) {
            addCriterion("coin_name between", value1, value2, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNameNotBetween(String value1, String value2) {
            addCriterion("coin_name not between", value1, value2, "coinName");
            return (Criteria) this;
        }

        public Criteria andCoinNumIsNull() {
            addCriterion("coin_num is null");
            return (Criteria) this;
        }

        public Criteria andCoinNumIsNotNull() {
            addCriterion("coin_num is not null");
            return (Criteria) this;
        }

        public Criteria andCoinNumEqualTo(BigDecimal value) {
            addCriterion("coin_num =", value, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumNotEqualTo(BigDecimal value) {
            addCriterion("coin_num <>", value, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumGreaterThan(BigDecimal value) {
            addCriterion("coin_num >", value, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coin_num >=", value, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumLessThan(BigDecimal value) {
            addCriterion("coin_num <", value, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coin_num <=", value, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumIn(List<BigDecimal> values) {
            addCriterion("coin_num in", values, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumNotIn(List<BigDecimal> values) {
            addCriterion("coin_num not in", values, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coin_num between", value1, value2, "coinNum");
            return (Criteria) this;
        }

        public Criteria andCoinNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coin_num not between", value1, value2, "coinNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNull() {
            addCriterion("exchange_num is null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIsNotNull() {
            addCriterion("exchange_num is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeNumEqualTo(BigDecimal value) {
            addCriterion("exchange_num =", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotEqualTo(BigDecimal value) {
            addCriterion("exchange_num <>", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThan(BigDecimal value) {
            addCriterion("exchange_num >", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_num >=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThan(BigDecimal value) {
            addCriterion("exchange_num <", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_num <=", value, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumIn(List<BigDecimal> values) {
            addCriterion("exchange_num in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotIn(List<BigDecimal> values) {
            addCriterion("exchange_num not in", values, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_num between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andExchangeNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_num not between", value1, value2, "exchangeNum");
            return (Criteria) this;
        }

        public Criteria andTradingTimeIsNull() {
            addCriterion("trading_time is null");
            return (Criteria) this;
        }

        public Criteria andTradingTimeIsNotNull() {
            addCriterion("trading_time is not null");
            return (Criteria) this;
        }

        public Criteria andTradingTimeEqualTo(Date value) {
            addCriterion("trading_time =", value, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeNotEqualTo(Date value) {
            addCriterion("trading_time <>", value, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeGreaterThan(Date value) {
            addCriterion("trading_time >", value, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("trading_time >=", value, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeLessThan(Date value) {
            addCriterion("trading_time <", value, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeLessThanOrEqualTo(Date value) {
            addCriterion("trading_time <=", value, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeIn(List<Date> values) {
            addCriterion("trading_time in", values, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeNotIn(List<Date> values) {
            addCriterion("trading_time not in", values, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeBetween(Date value1, Date value2) {
            addCriterion("trading_time between", value1, value2, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andTradingTimeNotBetween(Date value1, Date value2) {
            addCriterion("trading_time not between", value1, value2, "tradingTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("updated_time =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("updated_time <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("updated_time >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_time >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("updated_time <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("updated_time <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("updated_time in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("updated_time not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("updated_time between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("updated_time not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressIsNull() {
            addCriterion("withdraw_address is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressIsNotNull() {
            addCriterion("withdraw_address is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressEqualTo(String value) {
            addCriterion("withdraw_address =", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotEqualTo(String value) {
            addCriterion("withdraw_address <>", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressGreaterThan(String value) {
            addCriterion("withdraw_address >", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressGreaterThanOrEqualTo(String value) {
            addCriterion("withdraw_address >=", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressLessThan(String value) {
            addCriterion("withdraw_address <", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressLessThanOrEqualTo(String value) {
            addCriterion("withdraw_address <=", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressLike(String value) {
            addCriterion("withdraw_address like", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotLike(String value) {
            addCriterion("withdraw_address not like", value, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressIn(List<String> values) {
            addCriterion("withdraw_address in", values, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotIn(List<String> values) {
            addCriterion("withdraw_address not in", values, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressBetween(String value1, String value2) {
            addCriterion("withdraw_address between", value1, value2, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawAddressNotBetween(String value1, String value2) {
            addCriterion("withdraw_address not between", value1, value2, "withdrawAddress");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNull() {
            addCriterion("withdraw_status is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIsNotNull() {
            addCriterion("withdraw_status is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusEqualTo(Integer value) {
            addCriterion("withdraw_status =", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotEqualTo(Integer value) {
            addCriterion("withdraw_status <>", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThan(Integer value) {
            addCriterion("withdraw_status >", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_status >=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThan(Integer value) {
            addCriterion("withdraw_status <", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_status <=", value, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusIn(List<Integer> values) {
            addCriterion("withdraw_status in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotIn(List<Integer> values) {
            addCriterion("withdraw_status not in", values, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_status between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andWithdrawStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_status not between", value1, value2, "withdrawStatus");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeIsNull() {
            addCriterion("apply_for_incamate_time is null");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeIsNotNull() {
            addCriterion("apply_for_incamate_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeEqualTo(Date value) {
            addCriterion("apply_for_incamate_time =", value, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeNotEqualTo(Date value) {
            addCriterion("apply_for_incamate_time <>", value, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeGreaterThan(Date value) {
            addCriterion("apply_for_incamate_time >", value, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("apply_for_incamate_time >=", value, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeLessThan(Date value) {
            addCriterion("apply_for_incamate_time <", value, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeLessThanOrEqualTo(Date value) {
            addCriterion("apply_for_incamate_time <=", value, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeIn(List<Date> values) {
            addCriterion("apply_for_incamate_time in", values, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeNotIn(List<Date> values) {
            addCriterion("apply_for_incamate_time not in", values, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeBetween(Date value1, Date value2) {
            addCriterion("apply_for_incamate_time between", value1, value2, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andApplyForIncamateTimeNotBetween(Date value1, Date value2) {
            addCriterion("apply_for_incamate_time not between", value1, value2, "applyForIncamateTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeIsNull() {
            addCriterion("remit_time is null");
            return (Criteria) this;
        }

        public Criteria andRemitTimeIsNotNull() {
            addCriterion("remit_time is not null");
            return (Criteria) this;
        }

        public Criteria andRemitTimeEqualTo(Date value) {
            addCriterion("remit_time =", value, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeNotEqualTo(Date value) {
            addCriterion("remit_time <>", value, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeGreaterThan(Date value) {
            addCriterion("remit_time >", value, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("remit_time >=", value, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeLessThan(Date value) {
            addCriterion("remit_time <", value, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeLessThanOrEqualTo(Date value) {
            addCriterion("remit_time <=", value, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeIn(List<Date> values) {
            addCriterion("remit_time in", values, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeNotIn(List<Date> values) {
            addCriterion("remit_time not in", values, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeBetween(Date value1, Date value2) {
            addCriterion("remit_time between", value1, value2, "remitTime");
            return (Criteria) this;
        }

        public Criteria andRemitTimeNotBetween(Date value1, Date value2) {
            addCriterion("remit_time not between", value1, value2, "remitTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}