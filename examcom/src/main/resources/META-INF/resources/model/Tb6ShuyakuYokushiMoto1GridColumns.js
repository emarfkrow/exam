/**
 * 集約抑止元１グリッド定義
 */

let Tb6ShuyakuYokushiMoto1GridColumns = [];

$(function() {
    Tb6ShuyakuYokushiMoto1GridColumns = [
        Column.text('SHUYAKU_YOKUSHI_MOTO1_ID', Messages['Tb6ShuyakuYokushiMoto1Grid.shuyakuYokushiMoto1Id'], 80, 'primaryKey numbering', null),
        Column.text('SHUYAKU_YOKUSHI_ID', Messages['Tb6ShuyakuYokushiMoto1Grid.shuyakuYokushiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6ShuyakuYokushiMoto1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6ShuyakuYokushiMoto1Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6ShuyakuYokushiMoto1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
