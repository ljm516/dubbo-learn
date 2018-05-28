package top.ljming.provider.Service;

import top.ljming.common.api.CommonService;

public class ProviderService implements CommonService {
    public String getInfo(String name) {
        return "this is info: " + name;
    }
}
