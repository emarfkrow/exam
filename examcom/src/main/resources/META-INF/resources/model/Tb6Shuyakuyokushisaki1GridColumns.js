/**
 * 集約抑止先１グリッド定義
 */

let Tb6Shuyakuyokushisaki1GridColumns = [];

$(function() {
    Tb6Shuyakuyokushisaki1GridColumns = [
        Column.comma('SHUYAKUYOKUSHISAKI1_ID', Messages['Tb6Shuyakuyokushisaki1Grid.shuyakuyokushisaki1Id'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEIYOKUSHI_ID', Messages['Tb6Shuyakuyokushisaki1Grid.tenseiyokushiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb6Shuyakuyokushisaki1Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb6Shuyakuyokushisaki1Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb6Shuyakuyokushisaki1Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
