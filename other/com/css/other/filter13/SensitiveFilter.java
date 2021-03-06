package com.css.other.filter13;

/**
 * Sensitive过滤器实现类
 * 
 * 中国软件与技术服务股份有限公司-设计模式培训（Java版）
 * 
 * @author CSS. WangWeidong
 */
public class SensitiveFilter implements Filter {

	@Override
	public String doFilter(Context context, String str) {
		str = str.replace("敏感词1", "好词1").replace("敏感词2", "好词2").replace("王伟东", "Wang Weidong");
		context.setFilter(Factory.HTML_FILTER);
		return str;
	}
}
