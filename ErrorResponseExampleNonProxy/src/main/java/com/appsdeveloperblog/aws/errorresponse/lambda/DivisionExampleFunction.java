package com.appsdeveloperblog.aws.errorresponse.lambda;

import java.util.HashMap;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Handler for requests to Lambda function.
 */
public class DivisionExampleFunction implements RequestHandler<Map<String, Integer>, Map<String, Integer>> {

    public Map<String, Integer> handleRequest(final Map<String, Integer> input, final Context context) {

        Map<String, Integer> response = new HashMap<>();

        int dividend = input.get("dividend");
        int divisor = input.get("divisor");
        int result = (int) dividend / divisor;

        response.put("dividend", dividend);
        response.put("divisor", dividend);
        response.put("result", result);

        return response;
    }

}
