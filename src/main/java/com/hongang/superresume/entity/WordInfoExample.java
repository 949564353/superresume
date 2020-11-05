package com.hongang.superresume.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WordInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WordInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Long value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Long value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Long value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Long value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Long> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Long> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Long value1, Long value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andWordNameIsNull() {
            addCriterion("word_name is null");
            return (Criteria) this;
        }

        public Criteria andWordNameIsNotNull() {
            addCriterion("word_name is not null");
            return (Criteria) this;
        }

        public Criteria andWordNameEqualTo(String value) {
            addCriterion("word_name =", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotEqualTo(String value) {
            addCriterion("word_name <>", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameGreaterThan(String value) {
            addCriterion("word_name >", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameGreaterThanOrEqualTo(String value) {
            addCriterion("word_name >=", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLessThan(String value) {
            addCriterion("word_name <", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLessThanOrEqualTo(String value) {
            addCriterion("word_name <=", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameLike(String value) {
            addCriterion("word_name like", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotLike(String value) {
            addCriterion("word_name not like", value, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameIn(List<String> values) {
            addCriterion("word_name in", values, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotIn(List<String> values) {
            addCriterion("word_name not in", values, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameBetween(String value1, String value2) {
            addCriterion("word_name between", value1, value2, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordNameNotBetween(String value1, String value2) {
            addCriterion("word_name not between", value1, value2, "wordName");
            return (Criteria) this;
        }

        public Criteria andWordUrlIsNull() {
            addCriterion("word_url is null");
            return (Criteria) this;
        }

        public Criteria andWordUrlIsNotNull() {
            addCriterion("word_url is not null");
            return (Criteria) this;
        }

        public Criteria andWordUrlEqualTo(String value) {
            addCriterion("word_url =", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlNotEqualTo(String value) {
            addCriterion("word_url <>", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlGreaterThan(String value) {
            addCriterion("word_url >", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlGreaterThanOrEqualTo(String value) {
            addCriterion("word_url >=", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlLessThan(String value) {
            addCriterion("word_url <", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlLessThanOrEqualTo(String value) {
            addCriterion("word_url <=", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlLike(String value) {
            addCriterion("word_url like", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlNotLike(String value) {
            addCriterion("word_url not like", value, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlIn(List<String> values) {
            addCriterion("word_url in", values, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlNotIn(List<String> values) {
            addCriterion("word_url not in", values, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlBetween(String value1, String value2) {
            addCriterion("word_url between", value1, value2, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordUrlNotBetween(String value1, String value2) {
            addCriterion("word_url not between", value1, value2, "wordUrl");
            return (Criteria) this;
        }

        public Criteria andWordViewIsNull() {
            addCriterion("word_view is null");
            return (Criteria) this;
        }

        public Criteria andWordViewIsNotNull() {
            addCriterion("word_view is not null");
            return (Criteria) this;
        }

        public Criteria andWordViewEqualTo(Long value) {
            addCriterion("word_view =", value, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewNotEqualTo(Long value) {
            addCriterion("word_view <>", value, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewGreaterThan(Long value) {
            addCriterion("word_view >", value, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewGreaterThanOrEqualTo(Long value) {
            addCriterion("word_view >=", value, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewLessThan(Long value) {
            addCriterion("word_view <", value, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewLessThanOrEqualTo(Long value) {
            addCriterion("word_view <=", value, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewIn(List<Long> values) {
            addCriterion("word_view in", values, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewNotIn(List<Long> values) {
            addCriterion("word_view not in", values, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewBetween(Long value1, Long value2) {
            addCriterion("word_view between", value1, value2, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordViewNotBetween(Long value1, Long value2) {
            addCriterion("word_view not between", value1, value2, "wordView");
            return (Criteria) this;
        }

        public Criteria andWordDownloadIsNull() {
            addCriterion("word_download is null");
            return (Criteria) this;
        }

        public Criteria andWordDownloadIsNotNull() {
            addCriterion("word_download is not null");
            return (Criteria) this;
        }

        public Criteria andWordDownloadEqualTo(Long value) {
            addCriterion("word_download =", value, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadNotEqualTo(Long value) {
            addCriterion("word_download <>", value, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadGreaterThan(Long value) {
            addCriterion("word_download >", value, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadGreaterThanOrEqualTo(Long value) {
            addCriterion("word_download >=", value, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadLessThan(Long value) {
            addCriterion("word_download <", value, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadLessThanOrEqualTo(Long value) {
            addCriterion("word_download <=", value, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadIn(List<Long> values) {
            addCriterion("word_download in", values, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadNotIn(List<Long> values) {
            addCriterion("word_download not in", values, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadBetween(Long value1, Long value2) {
            addCriterion("word_download between", value1, value2, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordDownloadNotBetween(Long value1, Long value2) {
            addCriterion("word_download not between", value1, value2, "wordDownload");
            return (Criteria) this;
        }

        public Criteria andWordSizeIsNull() {
            addCriterion("word_size is null");
            return (Criteria) this;
        }

        public Criteria andWordSizeIsNotNull() {
            addCriterion("word_size is not null");
            return (Criteria) this;
        }

        public Criteria andWordSizeEqualTo(String value) {
            addCriterion("word_size =", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeNotEqualTo(String value) {
            addCriterion("word_size <>", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeGreaterThan(String value) {
            addCriterion("word_size >", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeGreaterThanOrEqualTo(String value) {
            addCriterion("word_size >=", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeLessThan(String value) {
            addCriterion("word_size <", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeLessThanOrEqualTo(String value) {
            addCriterion("word_size <=", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeLike(String value) {
            addCriterion("word_size like", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeNotLike(String value) {
            addCriterion("word_size not like", value, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeIn(List<String> values) {
            addCriterion("word_size in", values, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeNotIn(List<String> values) {
            addCriterion("word_size not in", values, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeBetween(String value1, String value2) {
            addCriterion("word_size between", value1, value2, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordSizeNotBetween(String value1, String value2) {
            addCriterion("word_size not between", value1, value2, "wordSize");
            return (Criteria) this;
        }

        public Criteria andWordShortIsNull() {
            addCriterion("word_short is null");
            return (Criteria) this;
        }

        public Criteria andWordShortIsNotNull() {
            addCriterion("word_short is not null");
            return (Criteria) this;
        }

        public Criteria andWordShortEqualTo(String value) {
            addCriterion("word_short =", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortNotEqualTo(String value) {
            addCriterion("word_short <>", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortGreaterThan(String value) {
            addCriterion("word_short >", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortGreaterThanOrEqualTo(String value) {
            addCriterion("word_short >=", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortLessThan(String value) {
            addCriterion("word_short <", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortLessThanOrEqualTo(String value) {
            addCriterion("word_short <=", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortLike(String value) {
            addCriterion("word_short like", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortNotLike(String value) {
            addCriterion("word_short not like", value, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortIn(List<String> values) {
            addCriterion("word_short in", values, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortNotIn(List<String> values) {
            addCriterion("word_short not in", values, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortBetween(String value1, String value2) {
            addCriterion("word_short between", value1, value2, "wordShort");
            return (Criteria) this;
        }

        public Criteria andWordShortNotBetween(String value1, String value2) {
            addCriterion("word_short not between", value1, value2, "wordShort");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("is_valid is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("is_valid is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("is_valid =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("is_valid <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("is_valid >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("is_valid <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("is_valid <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("is_valid like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("is_valid not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("is_valid in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("is_valid not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("is_valid between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("is_valid not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNull() {
            addCriterion("is_vip is null");
            return (Criteria) this;
        }

        public Criteria andIsVipIsNotNull() {
            addCriterion("is_vip is not null");
            return (Criteria) this;
        }

        public Criteria andIsVipEqualTo(String value) {
            addCriterion("is_vip =", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotEqualTo(String value) {
            addCriterion("is_vip <>", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThan(String value) {
            addCriterion("is_vip >", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipGreaterThanOrEqualTo(String value) {
            addCriterion("is_vip >=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThan(String value) {
            addCriterion("is_vip <", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLessThanOrEqualTo(String value) {
            addCriterion("is_vip <=", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipLike(String value) {
            addCriterion("is_vip like", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotLike(String value) {
            addCriterion("is_vip not like", value, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipIn(List<String> values) {
            addCriterion("is_vip in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotIn(List<String> values) {
            addCriterion("is_vip not in", values, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipBetween(String value1, String value2) {
            addCriterion("is_vip between", value1, value2, "isVip");
            return (Criteria) this;
        }

        public Criteria andIsVipNotBetween(String value1, String value2) {
            addCriterion("is_vip not between", value1, value2, "isVip");
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
