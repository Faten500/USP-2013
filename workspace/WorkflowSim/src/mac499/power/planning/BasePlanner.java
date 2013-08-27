/**
 * Copyright 2012-2013 University Of Southern California
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package mac499.power.planning;

import java.util.ArrayList;
import java.util.List;

import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.Vm;

/**
 * The base planner has implemented the basic features. Every other planning method
 * should extend from BasePlanner but should not directly use it. 
 *
 * @author Weiwei Chen
 * @since WorkflowSim Toolkit 1.0
 * @date Jun 17, 2013
 */
public abstract class BasePlanner implements PlannerInterface {

    /**
     * the task list.
     */
    private List<? extends Cloudlet> tasktList;
    /**
     * the vm list.
     */
    private List<? extends Vm> vmList;


    /**
     * Initialize a BaseScheduler
     */
    public BasePlanner() {
    }

    /**
     * Sets the job list.
     *
     * @param list
     */
    @Override
    public void setTaskList(List list) {
        this.tasktList = list;
    }

    /**
     * Sets the vm list
     *
     * @param list
     */
    @Override
    public void setVmList(List list) {
        this.vmList = new ArrayList(list);
    }

    /**
     * Gets the task list.
     *
     * @return the task list
     */
    @Override
    public List getTaskList() {
        return this.tasktList;
    }

    /**
     * Gets the vm list
     *
     * @return the vm list
     */
    @Override
    public List getVmList() {
        return this.vmList;
    }

    /**
     * The main function
     */
    public abstract void run() throws Exception;


}
